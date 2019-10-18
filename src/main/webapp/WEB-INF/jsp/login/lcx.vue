<template>
    <div id="app">
        <h2>{{msg}}</h2>
        <hr>
        <br>

        <li v-for="item in list">
            {{item.cata}}
            <ol>
                <li v-for="item1 in item.list">
                    {{item1.title}}
                </li>
            </ol>
        </li>
        <hr>
        <br>

        <li v-for="item in list1">
            {{item.title}}
        </li>
        <hr>
        <br>
        <li v-for="(item,key) in list1" v-bind:class="{'red':key==0,'blue':key==1 }">
            {{key}}--{{item.title}}
        </li>

        <input type="text" v-model="msg"><br>
        <button v-on:click="getMsg()">获取表单里面的数据get</button><br>
        <button v-on:click="setMsg()">设置表单里面的数据set</button><br><br><br><hr>

        <!--这里的ref相当于原生js的id,class,name-->
        <input type="text" ref="userInfo">
        <button @click="getInputValue()">获取表单里面的数据</button><br>

        <div ref="box">给我带上绿色吧</div>
        <hr>
        <br><br>

        <button @click="getDataValue()">点击请求数据</button><br>
        <li v-for="(item,key) in list2">
            {{key}}--{{item}}
        </li>
        <hr>
        <br><br>
        <button @click="deleteData('111')">点击弹出数据1</button>
        <button @click="deleteData('222')">点击弹出数据2</button><hr>
        <br><br>
        <button data-aid='123' @click="eventF($event)">事件对象</button>
    </div>

</template>

<script>

    //绑定数据
    export default{
        data() {
            return{
                msg:'你今天怎么样了呢',
                list2:[],
                list:[
                    {
                        'cata':'国际新闻',
                        "list":[
                            {"title":'星期一'},
                            {"title":'星期二'},
                            {"title":'星期三'}
                        ]
                    },
                    {
                        'cata':'学校新闻',
                        "list":[
                            {"title":'星期四'},
                            {"title":'星期五'},
                            {"title":'星期六'}
                        ]
                    }
                ],
                list1:[
                    {"title":'钱包怎么找回'},
                    {"title":'这个杯子多少钱'},
                    {"title":'你今年几岁了'}
                ],


            }
        },methods:{//data里面放的是数据,方法放到methods里面
            getMsg(){
                //alert('执行了vue的方法');
                //在方法里面获取data里面的数据
                alert(this.msg);

            },
            setMsg(){
                this.msg='我设置了新的msg';
            },
            getInputValue(){
                //获取ref定义的dom节点
                console.log(this.$refs.userInfo);
                alert(this.$refs.userInfo.value);
                if(this.$refs.userInfo.value==undefined ){
                    this.$refs.box.style.background='blue';}
                this.$refs.box.style.background='red';
            },
            getDataValue(){
                for(var i=0;i<10;i++){
                    this.list2.push('我是第一条数据'+i+'条数据');
                }
            },
            deleteData(val){
                alert(val);
            },
            eventF(e){
                console.log(e);
                e.srcElement.style.background='red';
                console.log(e.srcElement.dataset.aid);
            }

        }

    }
</script>

<style lang="scss">
    .red{
        color:red;
    }
    .blue{
        color:blue;
    }
    .box{
        width:300px;
        height:150px;
        background-color:red;
    }
</style>
