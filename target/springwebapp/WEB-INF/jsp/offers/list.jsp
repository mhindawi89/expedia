<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script
	src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<style>
* {
	box-sizing: border-box;
}

.menu {
	float: left;
	width: 20%;
	text-align: center;
}

.menu a {
	background-color: #e5e5e5;
	padding: 8px;
	margin-top: 7px;
	display: block;
	width: 100%;
	color: black;
}

.main {
	float: left;
	width: 60%;
	padding: 0 20px;
}

.right {
	background-color: #e5e5e5;
	float: left;
	width: 20%;
	padding: 15px;
	margin-top: 7px;
	text-align: center;
}

img {
	width: 100%;
	height: auto;
}

#myInput {
	background-image: url('/css/searchicon.png');
	/* Add a search icon to input */
	background-position: 10px 12px; /* Position the search icon */
	background-repeat: no-repeat; /* Do not repeat the icon image */
	width: 100%; /* Full-width */
	font-size: 16px; /* Increase font-size */
	padding: 12px 20px 12px 40px; /* Add some padding */
	border: 1px solid #ddd; /* Add a grey border */
	margin-bottom: 12px; /* Add some space below the input */
}

#myTable {
	border-collapse: collapse; /* Collapse borders */
	width: 100%; /* Full-width */
	border: 1px solid #ddd; /* Add a grey border */
	font-size: 18px; /* Increase font-size */
}

#myTable th, #myTable td {
	text-align: left; /* Left-align text */
	padding: 12px; /* Add padding */
}

#myTable tr {
	/* Add a bottom border to all table rows */
	border-bottom: 1px solid #ddd;
}

#myTable tr.header, #myTable tr:hover {
	/* Add a grey background color to the table header and on hover */
	background-color: #f1f1f1;
}

@media only screen and (max-width:620px) {
	/* For mobile phones: */
	.menu, .main, .right {
		width: 100%;
	}
}
</style>
</head>
<body style="font-family:Verdana;color:#aaaaaa;">

	<div style="background-color:#e5e5e5;padding:15px;text-align:center;">
		<h1>Expedia Offers</h1>
	</div>

	<div style="overflow:auto">
		<div class="menu">
			<c:forEach items="${hotelList}" var="hotel">
				<a href="<c:out value='${hotel.hotlUrls.hotelSearchResultUrl}'/>">${hotel.hotelInfo.hotelName}</a>
			</c:forEach>
		</div>

		<div data-role="main" class="ui-content">

			<input type="text" id="myInput" onkeyup="myFunction()"
				placeholder="Search for Offers...">

		</div>

		<div class="main">

			<table id="myTable" border="1">
				<tr>
					<th>HotelName</th>
					<th>HotelCity</th>
					<th>HotelImage</th>
					<th>HotelStarRating</th>
					<th>LengthOfStay</th>
					<th>TravelStartDate</th>
					<th>TravelEndDate</th>
				</tr>
				<tbody>
					<c:forEach items="${hotelList}" var="hotel">
						<tr>
							<td><c:out value="${hotel.hotelInfo.hotelName}" /></td>
							<td><c:out value="${hotel.destination.shortName}" /></td>
							<td><img
								src="<c:out value=" ${hotel.hotelInfo.hotelImageUrl}"/> "></td>
							<td><c:out value="${hotel.hotelInfo.hotelStarRating}" /></td>
							<td><c:out value="${hotel.offerRange.lengthOfStay}" /></td>
							<td><c:out value="${hotel.offerRange.travelStartDate}" /></td>
							<td><c:out value="${hotel.offerRange.travelEndDate}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<div
		style="background-color:#e5e5e5;text-align:center;padding:10px;margin-top:7px;">©
		copyright Expedia</div>

	<script>
		$(document).ready(function() {
			$('#myInput').keyup(function() {
				search_table($(this).val());
			});
			function search_table(value) {
				$('#myTable tr').each(function() {
					var found = 'false';
					$(this).each(function() {
						if ($(this).text().toLowerCase().indexOf(value.toLowerCase()) >= 0) {
							found = 'true';
						}
					});
					if (found == 'true') {
						$(this).show();
					} else {
						$(this).hide();
					}
				});
			}
		});
	</script>
</body>
</html>