# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "This package contains tools for the discovery of Roboception devices via GigE Vision."
AUTHOR = "Felix Ruess <felix.ruess@roboception.de>"
ROS_AUTHOR = "Heiko Hirschmueller <heiko.hirschmueller@roboception.de>"
HOMEPAGE = "https://github.com/roboception/rcdiscover"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "rcdiscover"
ROS_BPN = "rcdiscover"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/roboception-gbp/rcdiscover-release/archive/release/rolling/rcdiscover/1.1.2-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rcdiscover"
SRC_URI = "git://github.com/roboception-gbp/rcdiscover-release;${ROS_BRANCH};protocol=https"
SRCREV = "1a62c42b754e2de651e091f6065d4f137e6a7005"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}