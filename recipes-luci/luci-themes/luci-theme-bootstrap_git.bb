DESCRIPTION = "Web user interface for embedded devices - Bootstrap theme"

MODS="themes/bootstrap"

include ../luci.inc

RDEPENDS += "luci-theme-base"
RPROVIDES += "luci-theme" 

PR = "r0" 