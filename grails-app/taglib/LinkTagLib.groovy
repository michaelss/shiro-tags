import org.apache.shiro.SecurityUtils

class LinkTagLib {

	static namespace = "shiro"

	def link = { attrs, body ->
		String controller = attrs.controller ?: (attrs.url?.controller ?: controllerName)
		String action = attrs.action ?: (attrs.url?.action ?: actionName)

		if (SecurityUtils.subject.isPermitted("${controller}:${action}")) {
			out << g.link([action: attrs.action,
				controller: attrs.controller,
				resource: attrs.resource,
				namespace: attrs.namespace,
				plugin: attrs.plugin,
				elementId: attrs.elementId,
				id: attrs.id,
				fragment: attrs.fragment,
				mapping: attrs.mapping,
				params: attrs.params,
				uri: attrs.uri,
				relativeUri: attrs.relativeUri,
				url: attrs.url,
				absolute: attrs.absolute,
				base: attrs.base,
				event: attrs.event
				], body())
		}
	}
}