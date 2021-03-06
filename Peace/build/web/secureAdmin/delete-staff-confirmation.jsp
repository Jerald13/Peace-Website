<%@page import="model.Staff"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Staff Confirmation</title>
        <link rel="shortcut icon" type="image/x-icon" href="../images/logo.jpeg">
        <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="../assets/plugins/fontawesome/css/fontawesome.min.css">
        <link rel="stylesheet" href="../assets/plugins/fontawesome/css/all.min.css">
        <link rel="stylesheet" href="../assets/css/feathericon.min.css">
        <link rel="stylesheet" href="../assets/plugins/datatables/datatables.min.css">
        <link rel="stylesheet" href="../assets/plugins/morris/morris.css">
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap-datetimepicker.min.css">
        <link rel="stylesheet" href="../assets/css/style.css"> 
    </head>
    <body>
        <jsp:include page="../secureStaff/include/staffHeader.jsp" />
        <div class="main-wrapper">
            <div class="page-wrapper">
                <div class="content container-fluid">
                    <!-- fade modal-->
                    <div id="delete_asset" class="delete-modal" role="dialog">
                        <div class="modal-dialog modal-dialog-centered">
                            <div class="modal-content"style="top:180px;">
                                <form action="StaffDelete?staffId=<%=request.getParameter("staffId")%>" method="post">
                                    <div class="modal-body text-center"> <img src="../assets/img/sent.png" alt="" width="50" height="46">
                                        <h3 class="delete_class">Are you sure want to delete this Staff<br>(ID = <%=request.getParameter("staffId")%> Name = "<%=request.getParameter("staffName")%>")?</h3>
                                        <div class="m-t-20"> <a href="../secureStaff/StaffDisplay" class="btn btn-white" data-dismiss="modal">Close</a>
                                            <button type="submit" class="btn btn-danger">Delete</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="../assets/js/jquery-3.5.1.min.js"></script>
        <script src="../assets/js/popper.min.js"></script>
        <script src="../assets/js/bootstrap.min.js"></script>
        <script src="../assets/js/moment.min.js"></script>
        <script src="../assets/js/select2.min.js"></script>
        <script src="../assets/plugins/slimscroll/jquery.slimscroll.min.js"></script>
        <script src="../assets/js/bootstrap-datetimepicker.min.js"></script>
        <script src="../assets/plugins/datatables/jquery.dataTables.min.js"></script>
        <script src="../assets/plugins/datatables/datatables.min.js"></script>
        <script src="../assets/js/script.js"></script>
        <script>
            $(function () {
                $('#datetimepicker3').datetimepicker({
                    format: 'LT'
                });
            });
        </script>
    </body>
</html>
