<%-- 
    Document   : home
    Created on : Jun 19, 2019, 11:03:59 PM
    Author     : burakzengin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vehicle Registration</title>

        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
        <!-- Bootstrap core CSS -->
        <link href="static/home/css/bootstrap.min.css" rel="stylesheet">
        <!-- Material Design Bootstrap -->
        <link href="static/home/css/mdb.min.css" rel="stylesheet">
        <!-- Your custom styles (optional) -->
        <link href="static/home/css/style.css" rel="stylesheet">

        <style>
            html,body{ 
                background-image: url('static/images/77.jpg'); 
                background-size: cover;
                background-repeat: no-repeat;
                height: 85%;
                font-family: 'Numans', sans-serif;
            }
        </style>
    </head>
    <body>
        <jsp:include page="navbar.jsp"></jsp:include>


        <div class="container h-100">
            <div class="row h-100 justify-content-center align-items-center">

                <!-- Default form register -->
                <form class="text-center border border-light p-5" action="saveVehicle" method="POST" style="background-color: white; box-shadow: 2px 2px 5px black;">
                    <p class="h4 mb-4">Vehicle Registration Form</p>
                    <div class="form-row mb-4">
                        <div class="col">
                            <!-- First name -->
                            <input type="text" style="box-shadow: 0.5px 1px 2px black;" required name="licenceNumber" class="form-control" placeholder="License Number">
                        </div>
                        <div class="col">
                            <!-- Last name -->
                            <input type="text" style="box-shadow: 0.5px 1px 2px black;" required name="unitName" class="form-control" placeholder="Unit Name">
                        </div>
                    </div>

                    <div class="form-row mb-4">
                        <div class="col">
                            <!-- First name -->
                            <input type="text" style="box-shadow: 0.5px 1px 2px black;" required name="brand" class="form-control" placeholder="Brand">
                        </div>
                        <div class="col">
                            <!-- Last name -->
                            <input type="text" style="box-shadow: 0.5px 1px 2px black;" required name="model" class="form-control" placeholder="Model">
                        </div>
                    </div>

                    <div class="form-row mb-4">
                        <div class="col-4"></div>
                        <div class="col-4">
                            <!-- First name -->
                            <input type="text" style="box-shadow: 0.5px 1px 2px black;" required name="modelYear" class="form-control" placeholder="Model Year">
                        </div>
                        <div class="col-4"></div>
                    </div>

                    <div class="form-row mb-4">
                        <div class="col-2">
                            <p>Kind :</p>
                        </div>
                        <div class="col-2">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="kind" checked id="inlineRadio1" value="Owned">
                                <label class="form-check-label" for="Owned">Owned</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="kind" id="inlineRadio2" value="Rental">
                                <label class="form-check-label" for="Rental">Rental</label>
                            </div>
                        </div>
                        <div class="col-2"></div>
                        <div class="col-2">
                            <p>Type :</p>
                        </div>
                        <div class="col-4">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="type" checked id="inlineRadio3" value="Pond Vehicle">
                                <label class="form-check-label" for="PondVehicle">Pond Vehicle</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="type" id="inlineRadio4" value="Area Vehicle">
                                <label class="form-check-label" for="AreaVehicle">Area Vehicle</label>
                            </div>
                        </div>
                    </div>

                    <div class="form-row mb-4">
                        <div class="col-2"></div>
                        <div class="col-3">
                            <p>Vehicle Status :</p>
                        </div>
                        <div class="col-4">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" checked name="status" id="inlineRadio5" value="Active">
                                <label class="form-check-label" for="Active">Active</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="status" id="inlineRadio6" value="Inactive">
                                <label class="form-check-label" for="Inactive">Inactive</label>
                            </div>
                        </div>
                        <div class="col-2"></div>
                    </div>

                    <!-- Sign up button -->
                    <button class="btn btn-info my-4 btn-block" type="submit">Save Vehicle</button>

                </form>
                <!-- Default form register -->
            </div>
        </div>

        <!-- JQuery -->
        <script src="static/home/js/jquery-3.4.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script src="static/home/js/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script src="static/home/js/bootstrap.min.js"></script>
        <!-- MDB core JavaScript -->
        <script src="static/home/js/custom.min.js"></script>
    </body>
</html>
