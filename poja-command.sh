python -m poja \
  --app-name=poja-big-sum-std \
  --package-full-name=com.poja.sqlite \
  --region=eu-west-3 \
  --output-dir=. \
  --with-own-vpc=true \
  --ssm-sg-id=/poja-sqlite/sg/id \
  --ssm-subnet1-id=/poja-sqlite/subnet/public1/id \
  --ssm-subnet2-id=/poja-sqlite/subnet/public2/id