# 用户登录
## 请求数据格式
- URL: &ensp;localhost:8088/项目名/user/login
- Method: &ensp;POST
- Param(body): 

    |name|alias|type|must|ps|
    |:---:|:---:|:---:|:---:|:---:|
    |login_name|登录名|String|true||
    |password|密码|String|true||
    |其他|||||
    
    
## 响应数据格式

|name|alias|type|must|ps|
|:---:|:---:|:---:|:---:|:---:|
|code|登录名|String|true|状态码200：请求成功 500：账号不存在|
|msg|密码|String|true|提示信息|
|data|返回数据|JSON|false|后台返回的数据，JSON或JSONArray|

