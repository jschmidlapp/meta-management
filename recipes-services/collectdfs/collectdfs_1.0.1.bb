DESCRIPTION = "Exposes collectd statistics as a filesystem"
HOMEPAGE = "https://github.com/jschmidlapp/collectdfs"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

SRC_URI = "https://github.com/downloads/jschmidlapp/collectdfs/collectdfs-1.0.1.tar.bz2"
SRC_URI[sha256sum] = "bea7d9d21f1706f0f90a0d5e606ee36493a51f26678e7eef1ea56addf621c1a6"

PR = "r0"  
 
RDEPENDS="fuse collectd"

inherit autotools gettext
