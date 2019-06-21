<%-- 
    Document   : navbar
    Created on : Jun 20, 2019, 4:56:00 PM
    Author     : burakzengin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--Navbar -->
<nav class="mb-1 navbar navbar-expand-lg navbar-dark secondary-color lighten-1">
    <a class="navbar-brand" href="vehicleRegistration">İzmir Gaz</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-555"
            aria-controls="navbarSupportedContent-555" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent-555">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="vehicleRegistration">Vehicle Registration
                    <span class="sr-only">(current)</span>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="vehicleList">Vehicle List</a>
            </li>
        </ul>
        <ul class="navbar-nav ml-auto nav-flex-icons">
            <li class="nav-item">
                <a class="nav-link waves-effect waves-light" target="_blank" href="https://github.com/BurakZengin/VehicleTracking">Github
                    <i class="fab fa-github"></i>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link waves-effect waves-light" href="logout">Sign Out
                    <i class="fas fa-sign-out-alt"></i>
                </a>
            </li>
        </ul>
    </div>
</nav>
<!--/.Navbar -->