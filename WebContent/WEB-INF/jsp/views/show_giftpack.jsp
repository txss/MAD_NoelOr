<%@ include file="/WEB-INF/jsp/templates/include.jsp"%>
<%@ include file="/WEB-INF/jsp/templates/header.jsp"%>
<%@ include file="/WEB-INF/jsp/templates/nav_bar.jsp"%>

	<div class="container lister">
		<h3>listing des produits</h3>
		<ul style="list-style-type: square">
			<c:forEach items="${giftpack.products}" var="prod">
				<li><a href="/NoelOr/products/show_product.htm?id=${prod.id}">${prod.name}</a></li>
			</c:forEach>
		</ul>
	</div>
	<a class="btn btn-primary" href="buy_giftpack.htm?id=${giftpack.id}">Acheter le pack</a>
	<br />
<%@ include file="/WEB-INF/jsp/templates/footer.jsp"%>