<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Registration</title>
</head>
<body>

        <h2>Flight Details</h2>
        Flight Number: ${flight.flightNumber }</br>
        Operating Airline: ${flight.OperatingAirline }</br>
        Departure city: ${flight.departure }</br>
        Arrival city: ${flight.arrivalCIty }</br>
        Departure date: ${flight.dateOfDeparture }</br>
        
        <h2>Enter Passenger Details</h2>
        
        <form action="completeReservation" method="post">
        
        <pre>
        First Name<type type="text" name="firstName"/>
        Last Name<type type="text" name="lastName"/>
        Middle Name<type type="text" name="middleName"/>
        Email<type type="text" name="email"/>
        Phone<type type="text" name="Phone"/>
        <type type="hidden" name="flightId" value="1"/>
        
        <h2>Enter Payment Details</h2>
        Card Number<input type="text" name="cardNumber"/>
        CVV<input type="text" name="cvv"/>
        Expiry Date<input type="text" name="expirydate"/>
        <type type="submit" name="complete regervation"/>
        </pre>
        
        </form>
        
        
        
        
        
</body>
</html>