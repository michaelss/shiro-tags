# shiro-tags

When using Grails [Apache Shiro plugin](http://grails.org/plugin/shiro), it is possible to set permissions in terms of controllers and actions. However, to write the user interface, we need to place several `<g:if>` tags to control who sees the links to the restricted areas. So, this plugin adds the `<shiro:link>` and `<shiro:createLink>` tags, which are wrappers to the `<g:link>` and `<g:createLink>` tags, making visible only the links the current user has access to.

## Example usages

`<shiro:link controller="person" action="create">Create Person</shiro:link>`

`<g:createLink controller="book" />`

The same attributes of the original tags can be used. However, the access control is based on `controller` and `action` only.

## Requirements

* Grails version 2.4 > *

* [Shiro integration for Grails plugin](https://grails.org/plugin/shiro)
