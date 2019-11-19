datacenter = "dc1"

server = true

bootstrap_expect = 1
ui               = true

bind_addr   = "0.0.0.0"
client_addr = "0.0.0.0"

ports {
  grpc = 8502
}

connect {
  enabled = true
}

enable_central_service_config = true

"watches" = {
  "args" = ["/Users/kabu/hashicorp/intellij/springboot-consul-config/updateconfig.sh"]

  "handler_type" = "script"

  "key" = "config/application/data"

  "type" = "key"
}