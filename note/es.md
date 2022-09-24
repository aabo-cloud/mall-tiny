
## es
docker pull elasticsearch:6.8.23

docker run -d \
--name es \
-e "ES_JAVA_OPTS=-Xms256m -Xms256m" \
-e "discovery.type=single-node" \
-v es-data:/usr/share/elasticsearch/data \
-v es-plugins:/usr/share/elasticsearch/plugins \
--privileged \
-p 9200:9200 \
-p 9300:9300 \
elasticsearch:6.8.23

--network es-net \

docker stop


## kibana
运行kibana 注意IP一定不要写错
docker run --name kibana -e ELASTICSEARCH_HOSTS=http://192.168.159.141:9200 -p 5601:5601 -d kibana:6.8.23
