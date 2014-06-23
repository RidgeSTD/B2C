import http.client
import random
import time
#this is the python 3.3 version

for i in range(1,200):
	conn = http.client.HTTPConnection("today.hit.edu.cn")
	a = random.randint(1,255)
	b = random.randint(0,255)
	c = random.randint(0,255)
	d = random.randint(0,255)
	ipAddress = "%d.%d.%d.%d" % (a,b,c,d)
	headers={"X-Forwarded-For":ipAddress,"User-Agent":"Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:21.0) Gecko/20100101 Firefox/21.0"}
	conn.request("HEAD","/commend/103474_1.htm","",headers)
	time.sleep(0.1)
	res = conn.getresponse()
	print (res.status,res.reason)
