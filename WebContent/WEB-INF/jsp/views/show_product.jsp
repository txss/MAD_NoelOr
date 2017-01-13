<%@ include file="/WEB-INF/jsp/templates/include.jsp" %>
<%@ include file="/WEB-INF/jsp/templates/header.jsp"%>
<%@ include file="/WEB-INF/jsp/templates/nav_bar.jsp"%>

<table id="infos_perso">
			<tr>
				<td>${product.name}</td>
			</tr>
			<tr>
				<td>Prix:</td>
				<td>${product.price} EUR</td>
			</tr>
			<tr>
				<td>Stock:</td>
				<td>${product.stock}</td>
			</tr>
		</table>

<%@ include file="/WEB-INF/jsp/templates/footer.jsp" %>