# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "flexbe_core provides the core components for the FlexBE behavior engine."
AUTHOR = "Philipp Schillinger <philsplus@gmail.com>"
ROS_AUTHOR = "Philipp Schillinger"
HOMEPAGE = "http://ros.org/wiki/flexbe_core"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "flexbe_behavior_engine"
ROS_BPN = "flexbe_core"

ROS_BUILD_DEPENDS = " \
    flexbe-msgs \
    rclpy \
    std-msgs \
    std-srvs \
    tf2-ros-py \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    flexbe-msgs \
    rclpy \
    std-msgs \
    std-srvs \
    tf2-ros-py \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    flexbe-msgs \
    rclpy \
    std-msgs \
    std-srvs \
    tf2-ros-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    launch-ros \
    launch-testing \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/flexbe_behavior_engine-release/archive/release/jazzy/flexbe_core/3.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/flexbe_core"
SRC_URI = "git://github.com/ros2-gbp/flexbe_behavior_engine-release;${ROS_BRANCH};protocol=https"
SRCREV = "237e2098a1e767209cf6aa0806947e9d68ae024c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
