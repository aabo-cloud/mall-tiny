docker pull redis:3.2

mkdir /usr/local/app/redis/data 【创建文件夹】

touch /usr/local/app/redis/redis.conf 【创建文件】

docker run --name redis -p 6379:6379 \
-v /usr/local/app/redis/redis.conf:/etc/redis/redis.conf \
-v /usr/local/app/redis/data:/data \
-d --restart=always redis:3.2 redis-server /etc/redis/redis.conf \
--appendonly yes \
--requirepass "root"

docker中安装指定版本Redis
https://blog.csdn.net/suprezheng/article/details/110369005