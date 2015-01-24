# Short script to setup Seqware environment

echo "This script is work in progress..."
# Download VM
echo wget https://s3.amazonaws.com/oicr.vm/public/seqware_1.1.0-beta.0.ova

# Import appliance
echo VBoxManage import ...ovf

# Start VM
echo VBoxManage startvm 'Seqware'

