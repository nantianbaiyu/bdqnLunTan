<%--
Created by IntelliJ IDEA.
User: 33754
Date: 2020/6/25
Time: 21:13
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>博客系统设置</title>  
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>  
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span>博客系统设置</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="">
      <div class="form-group">
        <div class="label">
          <label>博客名称：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="name" value="" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>博客描述：</label>
        </div>
        <div class="field">
          <textarea class="input" name="description" style="height:80px"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>显示博文数量：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="entryNumber" value="" />
        </div>
      </div>
      <div class="form-group" style="display:none">
        <div class="label">
          <label>最新主题数量：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="recentEntryNumber" value="" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>最新评论数量：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="recentCommentNumber" value="" />
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>后台显示分页大小：</label>
        </div>
       <div class="field">
          <input type="text" class="input" name="backendPageSize" value="" />
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>评论需要批准：</label>
        </div>
        <div class="field">
          <div class="button-group radio">
          
          <label class="button active">
         	  <span class="icon icon-check"></span>             
              <input name="commentAudit" value="1" type="radio" checked="checked">是             
          </label>             
        
          <label class="button active"><span class="icon icon-times"></span>          	
              <input name="commentAudit" value="0"  type="radio" checked="checked">否
          </label>         
           </div>       
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>状态：</label>
        </div>
        <div class="field">
          <div class="button-group radio">
          
          <label class="button active">
         	  <span class="icon icon-check"></span>             
              <input name="status" value="1" type="radio" checked="checked">开             
          </label>             
        
          <label class="button active"><span class="icon icon-times"></span>          	
              <input name="status" value="0"  type="radio" checked="checked">关
          </label>         
           </div>       
        </div>
      </div>      
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit">更新</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body>
</html>