$(document).ready(()=> {
    let editImcId = null;
    $('#modal-save-button').click(() => {
        const nume = $('#modal-imc-nume').val();
        const inaltime = $('#modal-imc-inaltime').val();
        const greutate = $('#modal-imc-greutate').val();
        const rezultat = $('#modal-imc-rezultat').val();

        const body = {
            nume: nume,
            inaltime: inaltime,
            greutate: greutate,
            rezultat: rezultat
        };
        if (editImcId === null) {
            addNewImc(body);
        } else {
            editImc(editImcId, body);
        }
    });
        $('.fa-trash-alt').click(function () {
            const imcId = this.parentElement.id;
            fetch('api/imcs/' + imcId, {
                method: 'delete'
            }).then(response => location.reload());
        });
    $('.fa-edit').click(function () {
        editImcId = this.parentElement.id;

        const row = this.parentElement.parentElement.parentElement;
        const nume = row.children[0].innerText;
        const inaltime = row.children[1].innerText;
        const greutate = row.children[2].innerText;
        const rezultat = row.children[3].innerText;


        $('#modal-imcs-nume').val(nume);
        $('#modal-imcs-inaltime').val(inaltime);
        $('#modal-imcs-greutate').val(greutate);
        $('#modal-imcs-rezultat').val(rezultat);

    });

        function addNewImc(body) {
            fetch('/api/imcs', {
                method: 'post',
                body: JSON.stringify(body),
                headers: {
                    'Content-Type': 'application/json'
                }
            }).then(response => {
                location.reload();
            });
        }
        function editImc(id, body) {
            fetch('/api/imcs/' + id, {
                method: 'put',
                body: JSON.stringify(body),
                headers: {
                    'Content-Type': 'application/json'
                }
            }).then(() => {
                location.reload();
                editImcId = null;
            });
        }
    });
