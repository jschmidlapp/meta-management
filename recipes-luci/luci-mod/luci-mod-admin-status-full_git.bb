DESCRIPTION = "Web user interface for embedded devices - core UI module"

MODS="modules/admin-full-status"

include ../luci.inc

RDEPENDS += "luci-mod-admin-core"

PR = "r2" 