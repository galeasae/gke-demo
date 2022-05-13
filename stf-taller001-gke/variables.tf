variable "name" {
  default = "gke-dev-stftaller001"
}

variable "project" {
  default = "stf-taller001-349601"
}

variable "name-pool" {
  default = "gke-pool"
}

variable "location" {
  default = "us-east1-b"
}

variable "initial_node_count" {
  default = 1
}

variable "machine_type" {
#   default = "e2-standard-2"
default = "e2-micro"
}