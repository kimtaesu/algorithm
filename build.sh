#!/bin/bash
set -e

# You can run it from any directory.
PROJECT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )/.."

chmod -x "$PROJECT_DIR"/gradlew
"$PROJECT_DIR"/gradlew --no-daemon --info --stacktrace clean build