import org.apache.shiro.SecurityUtils

class LinkTagLib extends ShiroBaseTagLib {

	def link = { attrs, body ->
        protectedTag(attrs, body, g.link([action: attrs.action,
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
			], body()))
	}
}
