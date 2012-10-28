DESCRIPTION = "Web user interface for embedded devices - core UI module"

MODS="modules/admin-core"

include ../luci.inc

RDEPENDS += "luci-lib-web luci-sgi-cgi luci-lib-core"

PR = "r0" 