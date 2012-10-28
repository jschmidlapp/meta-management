DESCRIPTION = "Web user interface for embedded devices - core library"

MODS="libs/core"
I18N_MOD = "core"

RDEPENDS += "lua5.1 uci"

include ../luci.inc

PR = "r2"

do_install_append() {
         mv ${D}/usr/lib/lua/luci/model/network.lua.angstrom ${D}/usr/lib/lua/luci/model/network.lua   		  
}
