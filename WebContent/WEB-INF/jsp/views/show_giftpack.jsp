<%@ include file="/WEB-INF/jsp/templates/include.jsp"%>
<%@ include file="/WEB-INF/jsp/templates/header.jsp"%>
<%@ include file="/WEB-INF/jsp/templates/nav_bar.jsp"%>

	<div class="container lister">
		<h3>listing des produits</h3>
		<ul style="list-style-type: square">
			<c:forEach items="${giftpack.products}" var="prod">
				<li><a href="/NoelOr/products/show_product.htm?id=${prod.id}">${prod.name}</a> (x1)</li>
			</c:forEach>
		</ul>
	</div>
	<h4>Obtenir ce pack pour seulement: ${price} EUR</h4>
	<a class="btn btn-primary" href="buy_giftpack.htm?id=${giftpack.id}">Acheter le pack</a>
	<br />
<%@ include file="/WEB-INF/jsp/templates/footer.jsp"%>