#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/ry_20240629.sql ./mysql/db
cp ../sql/ry_config_20240902.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../verify-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy verify-gateway "
cp ../verify-gateway/target/verify-gateway.jar ./verify/gateway/jar

echo "begin copy verify-auth "
cp ../verify-auth/target/verify-auth.jar ./verify/auth/jar

echo "begin copy verify-visual "
cp ../verify-visual/verify-monitor/target/verify-visual-monitor.jar  ./verify/visual/monitor/jar

echo "begin copy verify-modules-system "
cp ../verify-modules/verify-system/target/verify-modules-system.jar ./verify/modules/system/jar

echo "begin copy verify-modules-file "
cp ../verify-modules/verify-file/target/verify-modules-file.jar ./verify/modules/file/jar

echo "begin copy verify-modules-job "
cp ../verify-modules/verify-job/target/verify-modules-job.jar ./verify/modules/job/jar

echo "begin copy verify-modules-gen "
cp ../verify-modules/verify-gen/target/verify-modules-gen.jar ./verify/modules/gen/jar

