DESCRIPTION = "Web user interface for embedded devices - core UI module"

MODS="modules/admin-angstrom"

include ../luci.inc

RDEPENDS += "luci-mod-admin-core luci-mod-admin-status-full"

PR = "r3" 