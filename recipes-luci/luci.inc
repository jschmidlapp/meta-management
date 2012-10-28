HOMEPAGE = "http://luci.subsignal.org/trac"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b42edef8fa55315f34f2370b4715ca9"

CVS_TARBALL_STASH = ""
SRC_TARBALL_STASH = ""

SRC_URI = "git:///home/jason/git/luci;protocol=file;branch=master" \
		   file://../files/001-Makefile-modules.patch \
		   file://../files/002-Makefile-host-path.patch \
		   file://../files/004-relocate-i18n.patch \
		   file://../files/005-no-i18nbuild.patch"

SRCREV = "6c806e30b7d5c7e4e8d3c21de2ccd9f83d915eb4"

S = "${WORKDIR}/git"

FILES_${PN} += "/usr/lib/lua /www /tmp /luci /usr/lib/lua/luci"

I18N_MOD ?= "none"

do_compile() {
	export MODULES='${MODS}' 
	export HOST='${D}' 
	MODULES='${MODS}' HOST='${D}' make CC='${CC}' 
}

do_install() {
	MODULES=${MODS} HOST=${D} I18N_MODULE=${I18N_MOD} oe_runmake hostcopy i18nbuild
}