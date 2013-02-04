wget -O ros_comm http://packages.ros.org/web/rosinstall/generate/raw/groovy/ros_comm
mkdir -p archives
grep -e "- tar: {local-name: .*, uri: '.*'," ros_comm | \
grep -v "catkin" | grep -v "cpp_common" | grep -v "rostime" | grep -v "roscpp_serialization" | grep -v "roscpp_traits" | \
sed "s#- tar: {local-name: \(.*\), uri: '\(.*\)',#wget -O archives/\1.tar.gz \2 \&\& mkdir -p src/\1 \&\& tar --strip-components=1 -xzf archives/\1.tar.gz -C src/\1/ #" | sh
tar -czf src.tar.gz src


