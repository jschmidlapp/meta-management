DESCRIPTION = "System statistics collection daemon"
HOMEPAGE = "http://collectd.org/"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "http://collectd.org/files/collectd-5.1.0.tar.bz2 \
		   file://001-remove-ltdl.patch \
		   file://002-missing-AM_PATH_LIBGCRYPT.patch"
		   
SRC_URI[sha256sum] = "521d4be7df5bc1124b7b9ea88227e95839a5f7c1b704a5bde0f60f058ec6eecb"

inherit autotools

PR="r4"

EXTRA_OECONF += "--with-fp-layout=nothing \
				 --disable-snmp \
				 --with-libnetsnmp=no \
				 --with-libperl=no \
				 --disable-perl \
				 --with-libgcrypt=no"

DEPENDS="libtool"

do_configure() {
	autoheader
	aclocal
	libtoolize --force --debug
	automake --add-missing --copy
	autoconf
	oe_runconf
}
			
do_compile() {
	LTDLINCL='-I${STAGING_INCDIR_NATIVE}' LIBLTDL=-lltdl oe_runmake
}			
			     