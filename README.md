# shiro-tags

When using Grails [Apache Shiro plugin](http://grails.org/plugin/shiro), it is possible to set permissions in terms of controllers and actions. However, to write the interface, we need to place several `<g:if>` tags to control who sees the links to the restricted areas. This plugin adds the `<shiro:link>` tag, which is a wrapper to the `<g:link>` tag, making visible only the links the current user has access to.

## Example usage

`<shiro:link controller="person" action="create">Create Person</shiro:link>`

By now, the only supported attributes are `controller` and `action`. The other regular `<g:link>` attributes may be used as well and they will work normally, but the presentation of the link will depend exclusively on the permission to access the supplied controller/action.

## Requirements

Grails version 2.4 > *

Shiro integration for Grails plugin
