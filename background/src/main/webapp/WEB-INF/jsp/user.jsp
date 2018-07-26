<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>用户管理</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script>
        $(function(){
            // function getAllUser() {
            //     var result = $.get('/user/list/all',function(data,textStatus){
            //         alert(data);
            //     });
            // }

            $("#queryBtn").click(function(){
                getAllUser();
            });
        });
    </script>
</head>
<body>
    <nav class="navbar  navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">后台管理</a>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                </ul>
            </div>
        </div>
    </nav>

    <div class="container-fluid" style="margin-top: 50px;">
        <div class="row">
            <div class="col-sm-3 col-md-2" >
                <ul class="nav nav-sidebar">
                    <li class="active"><a href="/user">用户管理</a></li>
                    <li><a href="/role">角色管理</a></li>
                    <li><a href="/permission">权限管理</a></li>
                </ul>
            </div>
            <div class="col-sm-9  col-md-10" >
                <h2>用户</h2>
                <div class="table-responsive">
                    <table id="userTable" class="table table-bordered table-hover table-striped">
                        <thead>
                        <tr>
                            <th>用户名</th>
                            <th>创建日期</th>
                            <th>密码</th>
                            <th>姓名</th>
                            <th>电话</th>
                            <th>Emial</th>
                            <th>QQ</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th>用户名</th>
                            <th>创建日期</th>
                            <th>密码</th>
                            <th>姓名</th>
                            <th>电话</th>
                            <th>Email</th>
                            <th>QQ</th>
                            <td>
                                <button id="modifyBtn" class="btn btn-primary">编辑</button>
                                <button id="deleteOneBtn" class="btn btn-danger">删除</button>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div>
                    <button id="addBtn" class="btn btn-primary">新增</button>
                    <button id="deleteBatchBtn" class="btn btn-danger">删除</button>
                    <button id="queryBtn" class="btn btn-primary">查询</button>
                </div>
            </div>
        </div>
    </div>
</body>


<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>
</html>
