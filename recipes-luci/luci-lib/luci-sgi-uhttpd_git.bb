DESCRIPTION = "Web user interface for embedded devices - Binding for uHTTPd webserver"

MODS="libs/sgi-uhttpd"

include ../luci.inc

DEPENDS += "uhttpd uhttpd-mod-lua"

PR = "r0" 