package fr.univ.noel.web.controlers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.univ.noel.managers.ProductManager;

@Controller()
@RequestMapping("products")
public class ProductController {

	protected final Log logger = LogFactory.getLog(getClass());
	
	ProductManager productManager = new ProductManager();
	

	@RequestMapping(value = "/product_List", method = RequestMethod.GET)
	public String showProductList(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		session.setAttribute("products_list", productManager.allProduct() );
		logger.info("Returning product_List view");
		return "lister_product";
	}
	
	
	@RequestMapping(value = "/show_product", method = RequestMethod.GET)
	public String showProduct(
			HttpServletRequest request,
			@RequestParam(value = "id", required = false) int productID) {
				
		HttpSession session = request.getSession();
		
		session.setAttribute("product", productManager.getProduct(productID));
		
		logger.info("Returning show_product view");
		return "show_product";
	}
	
	
	@RequestMapping(value = "/delete_product", method = RequestMethod.GET)
	public String deleteProduct(
			@RequestParam(value = "id", required = false) int productID) {
				
		productManager.deleteProduct(productID);
		
		logger.info("Returning lister_product view, after delete product id " + productID);
		return "lister_product";
	}
	
	@RequestMapping(value = "/buy_product", method = RequestMethod.GET)
	public String buyProduct(
			HttpServletRequest request,
			@RequestParam(value = "id", required = false) int productID) {
				
		HttpSession session = request.getSession();
		
		session.setAttribute("product", productManager.buyProduct(productID));
		
		logger.info("Returning confirm_buy_product view, after delete product");
		return "commande_confirm";
	}
}
