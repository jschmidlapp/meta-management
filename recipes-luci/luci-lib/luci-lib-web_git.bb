DESCRIPTION = "Web user interface for embedded devices - MVC framework library"

MODS="libs/web"

include ../luci.inc

#RDEPENDS += "luci-lib-sys luci-lib-nixio luci-lib-core luci-sgi-cgi luci-lib-lmo"
RDEPENDS += "luci-theme-openwrt luci-lib-uci luci-lib-nixio luci-lib-sys luci-lib-lmo"

FILES_${PN}-dbg += "/usr/lib/lua/luci/template/.debug"
FILES_${PN} += "/lib/uci /usr/lib/lua/luci/template"

PR = "r3" 