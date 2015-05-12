import org.apache.shiro.SecurityUtils

abstract class ShiroBaseTagLib {

    static namespace = "shiro"

    protected def protectedTag = { attrs, body, tagContent ->
        String controller = attrs.controller ?: (attrs.url?.controller ?: controllerName)
        String action = attrs.action ?: (attrs.url?.action ?: actionName)

        if (SecurityUtils.subject.isPermitted("${controller}:${action}")) {
            out << tagContent
        }
    }
}
