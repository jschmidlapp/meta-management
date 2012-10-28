DESCRIPTION = "Allows access to collectd statistics via SNMP"
HOMEPAGE = "https://github.com/jschmidlapp/collectd-agent"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

SRC_URI = "https://github.com/downloads/jschmidlapp/collectd-agent/collectd-agent-1.0.2.tar.bz2"
SRC_URI[sha256sum] = "40c620f5d20363d0e76c08b67710e2bfc6ba3defd0848542c88535bc0b2e006e"

PR = "r0"  
 
RDEPENDS="net-snmp collectd"

inherit autotools gettext

EXTRA_OECONF += "--with-net-snmp-config=${STAGING_BINDIR}/net-snmp-config"