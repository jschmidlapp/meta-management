DESCRIPTION = "Web user interface for embedded devices - HTTP(S) client library"

MODS="libs/httpdclient"

include ../luci.inc

RDEPENDS += "luci-lib-web luci-lib-nixio"

PR = "r0" 