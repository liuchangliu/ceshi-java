<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<!-- 引入vue -->
<script src="static/plugins/vue.min.js"></script>
<!-- 引入jquery -->
<script src="static/plugins/jquery.min.js"></script>
<!-- 引入样式 -->
<link rel="stylesheet"
      href="static/plugins/element-ui/theme-default/index.css">
<!--引入组件库-->
<script src="static/plugins/element-ui/index.js"></script>
<style>
    /*body{
        background-repeat:no-repeat;
        background-size: 100%;
    }
*/
</style>

<body>
<div id="rrapp">
    <div v-show="showlist">aaaa<button @click="add">隐藏</button>
        <el-steps :active="msg"  v-model="msg" align-center>
            <el-step title="步骤1" description="手机注册"></el-step>
            <el-step title="步骤2" description="设置密码"></el-step>
            <el-step title="步骤3" description="完善资料"></el-step>
        </el-steps>
    </div>

    <button @click="getMsg">获取表单里面的数据get</button><br>

    <el-button type="primary" @click="changeMsgValue">下一步</el-button>
</div>
<div>
    <router-view></router-view>
</div>

<i class="el-icon-edit"></i>
<i class="el-icon-share"></i>
<i class="el-icon-delete"></i>
<el-button type="primary" icon="el-icon-search">搜索</el-button>
</body>
</html>
<script type="text/javascript">
    //测试vue
    $(function(){
        console.log("asd")
        $.ajax({
            type: "POST",
            url: "/user/list",
            contentType: "application/json",
            success: function(r){
                console.log(r)
                for(var i=0;i<r.length;i++){
                    console.log(r[i])
                    if(r[i]=="admin"){
                        console.log("admin用户")
                        $(".admin").css("display","block");
                    }
                }
            }
        });
    })
    var vm = new Vue({
        el : '#rrapp',
        data : {
            msg:'1',
            showlist : true,
        },


        methods : {
            add:function(){
                alert("asd")
                vm.showlist = false;
            },
            getMsg:function () {
                alert(this.msg);
            },
            changeMsgValue:function () {
                    this.msg++;
            }
        }
    });
</script>