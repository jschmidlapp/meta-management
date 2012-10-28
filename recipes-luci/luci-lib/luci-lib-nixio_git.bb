DESCRIPTION = "Web user interface for embedded devices - NIXIO POSIX library"

MODS="libs/nixio"

include ../luci.inc

FILES_${PN} += "/lib"
FILES_${PN}-dbg += "/usr/lib/lua/.debug/"

RDEPENDS += "lua5.1"

PR = "r0" 