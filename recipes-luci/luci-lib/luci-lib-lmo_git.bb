DESCRIPTION = "Web user interface for embedded devices - LMO i18n library"

MODS="libs/lmo"

include ../luci.inc

FILES_${PN}-dbg += "/usr/lib/lua/.debug/"

DEPENDS += "lua5.1"

PR = "r1" 