DESCRIPTION = "Web user interface for embedded devices - device diagnostics tool"

MODS="applications/diag-devinfo"
I18N_MOD ?= "diag_devinfo"

include ../luci.inc

RDEPEND += "luci-app-diag-core"

PR = "r0" 