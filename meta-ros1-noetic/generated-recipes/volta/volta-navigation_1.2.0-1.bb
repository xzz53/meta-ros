# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The volta_navigation package"
AUTHOR = "Nikhil Venkatesh <nilhil@botsync.co>"
ROS_AUTHOR = "Nikhil Venkatesh <nikhil@botsync.co>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "volta"
ROS_BPN = "volta_navigation"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    amcl \
    dwa-local-planner \
    global-planner \
    gmapping \
    map-server \
    move-base \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/botsync-gbp/volta-release/archive/release/noetic/volta_navigation/1.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/volta_navigation"
SRC_URI = "git://github.com/botsync-gbp/volta-release;${ROS_BRANCH};protocol=https"
SRCREV = "90fa908ca4c2c913c28dcda3c846ca0c21f0243c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}