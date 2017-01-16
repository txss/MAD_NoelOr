package fr.univ.noel.web.controlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.univ.noel.managers.GiftPackManager;

@Controller()
@RequestMapping("gift_packs")
public class GiftPackController {

	protected final Log logger = LogFactory.getLog(getClass());
	
	GiftPackManager giftpackManager = new GiftPackManager();
	
	
	@RequestMapping(value = "/giftPack_List", method = RequestMethod.GET)
	public String showGiftPacksList(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		session.setAttribute("giftPack_list", giftpackManager.allGiftPacks());
		
		logger.info("Returning giftPack_List view");
		return "lister_giftPack";
	}
	
	@RequestMapping(value = "/show_giftpack", method = RequestMethod.GET)
	public String showGiftpack(
			HttpServletRequest request,
			@RequestParam(value = "id", required = false) int giftpackID) {
				
		HttpSession session = request.getSession();
		
		session.setAttribute("giftpack", giftpackManager.getGiftPack(giftpackID));
		logger.info("Returning show_giftpack view");
		return "show_giftpack";
	}
	
	@RequestMapping(value = "/delete_giftpack", method = RequestMethod.GET)
	public String deleteProduct(
			@RequestParam(value = "id", required = false) int giftpackID) {
				
		giftpackManager.delete(giftpackID);
		
		logger.info("Returning lister_giftpack view, after delete giftpack id "+ giftpackID);
		return "lister_giftpack";
	}
	
	
	@RequestMapping(value = "/buy_giftpack", method = RequestMethod.GET)
	public String buyProduct(
			HttpServletRequest request,
			@RequestParam(value = "id", required = false) int giftpackID) {
				
		HttpSession session = request.getSession();
		
		session.setAttribute("giftpack", giftpackManager.buyGiftPack(giftpackID));
		
		logger.info("Returning confirm_buy_giftpack view, after delete product");
		return "commande_confirm_giftpack";
	}
}
