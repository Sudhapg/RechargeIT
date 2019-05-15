<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Bar</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        html,body{
           <!-- background-color: #d9534f;-->
        }
        .main_container{
            width: 80%;
            background-color: #b2ad7f;
            color: #f9f9f9;
            font-family: 'Poppins', sans-serif;
            margin: 0px auto;
            padding: 15px;
        }

        .content_page{
            width: 50%;
            padding: 20px;
            margin: 0px auto;
            background-color: #0c2c3b;
            color: white;
            text-align: center;
        }

        .menu_container{
           	width: 100%;
			background-color: #0c2c3B;
            }
            
         .menu_container .menu_item nav ul li a{
            display: inline;
            color: white;
            padding: 21px 37px;
            border-radius: 3px;
            }

         .menu_container .menu_item nav ul li a:hover{
	    background-color: #becccf;
	    color: #1c1808;
            }

            li{
                list-style-type: none;
                display: inline;
            }

            a{
                text-decoration: none;
            }

    .dropbtn {
	color: white;
    padding: 21px 37px;
    /*border-radius: 3px;*/
    border: none;
    background-color: #0c2c3b;
    font-family: 'Poppins', sans-serif;
    font-size: 15px;
    }
    
         .dropdown {
	  position: relative;
	  display: inline-block;
    }
    
    /* Dropdown Content (Hidden by Default) */
	.dropdown-content {
	  display: none;
	  position: absolute;
	  background-color: #f1f1f1;
	  min-width: 160px;
	  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
	  z-index: 1;
	}
		.dropdown-content a {
	  color: black;
	  padding: 12px 16px;
	  text-decoration: none;
	  display: block;
    }
    /* Change color of dropdown links on hover */
	.dropdown-content a:hover {background-color: #becccf ;}

    /* Show the dropdown menu on hover */
	.dropdown:hover .dropdown-content {display: block;}

    /* Change the background color of the dropdown button when the dropdown content is shown */
	.dropdown:hover .dropbtn {background-color: #becccf;}

    h1{
        text-align: center;
    }
    
	footer{
        position: fixed;
        width: 80%;
        bottom: 0;
        margin: 0px auto;
        background-color: #0c2c3b;
        color: white;
        text-align: center;
    }
       
    </style>
</head>
<body>
    
        <header>
        <div class="menu_container">
            <div class="menu_item">
                <nav>
						<ul>
					<!-- 	<li><img src=" <%=request.getContextPath()%>/images/littlemindsbookbox.png" alt="Photography.jpg" style ="width: 80px;height: 80px;"></li> -->
							<li><a href="${pageContext.request.contextPath}/">Home</a></li>
							<li><a href="${pageContext.request.contextPath}/About">About</a></li>
							<li><a href="${pageContext.request.contextPath}/browsebooks">BrowseBooks</a></li>
							<li><a href="${pageContext.request.contextPath}/login">Login</a></li>
							<li><a href="${pageContext.request.contextPath}/subscribe">Subscribe</a></li>
			                <div class="dropdown" >
                                <button class="dropbtn" style="border:none;">My Account
                                <i class="fa fa-caret-down"></i>
                                </button>
                                <div class="dropdown-content">
                                    <a href="${pageContext.request.contextPath}/manageaccount">Manage Account</a>
                                   <!-- <a href="./views/Myvideos.html">My Videos</a> -->
                                </div>
                            </div>
                            <li><a href="${pageContext.request.contextPath}/logout">Logout</a></li>
                    </ul>
					</nav>
            </div>
            </div>

</header>
</body>
</html>