#!/bin/bash
TODAY := $(shell date +'%Y-%m-%d')
CURRENT_BRANCH := $(shell git rev-parse --abbrev-ref HEAD)

help: ## Show this help message
	@echo "usage: make [target]"
	@echo
	@echo "targets:"
	@egrep "^(.+)\:\ ##\ (.+)" ${MAKEFILE_LIST} | column -t -c 2 -s ":#"

gitpush: ## git push m=any message
	clear;
	git add .; git commit -m "$(m)"; git push;

gp: ## git push m=any message
	clear;
	git add .; git commit -m "$(m)"; git push;

CURRENT_BRANCH := $(shell git rev-parse --abbrev-ref HEAD)
update-branch:  ## update main branches
	git fetch --all;

	git checkout main; git reset --hard origin/main;
	git checkout eaf-dev; git reset --hard origin/eaf-dev;

	git checkout $(CURRENT_BRANCH);
	git branch --sort=-committerdate
	git diff eaf-dev main --name-only

