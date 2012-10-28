DESCRIPTION = "Web user interface for embedded devices - full stack webserver library"

MODS="libs/lucid"

include ../luci.inc

DEPENDS += "luci-lib-nixio luci-lib-web luci-lib-px5g"

PR = "r0" 