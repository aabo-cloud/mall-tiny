
docker ps -a

service NetworkManager stop
chkconfig NetworkManager off

systemctl restart network

删除docker中所有exited状态的容器
sudo docker ps -a | grep Exited | cut -d ' ' -f 1 | xargs sudo docker rm
