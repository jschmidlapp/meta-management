DESCRIPTION = "Unified Configuration Interface"
HOMEPAGE = "http://wiki.openwrt.org/doc/uci"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/jschmidlapp/uci.git;protocol=git;branch=master"
		   
SRCREV = "fcf9283a9cf7044f225dec56f1143ecccb9ddba4"
S = "${WORKDIR}/git"

inherit cmake

PR="r1"

EXTRA_OECMAKE = "-DLUAPATH=/usr/lib/lua/5.1"

FILES_${PN} += "/usr/lib/lua /usr/lib/libuci.so"
FILES_${PN}-dbg += "/usr/lib/lua/5.1/.debug"