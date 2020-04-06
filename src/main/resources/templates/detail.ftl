<#import "parts/common.ftl" as c>
<@c.page>
    <div class="card-body">
    <#if newsRecord.image??><img src="/img?id=${newsRecord.getImage().getId()}"/></#if>
    <h3 class="card-title">${newsRecord.title}</h3>
    <time>${newsRecord.created}</time>
    <div>${newsRecord.text}</div>
    <div><a href="/">Go back</a></div>
    </div>
</@c.page>