DESCRIPTION = "Web user interface for embedded devices - Fastindex indexing library"

MODS="libs/fastindex"

include ../luci.inc

RDEPENDS += "luci-lib-fastindex liblua"

PR = "r0" 